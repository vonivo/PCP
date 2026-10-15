:- use_module(library(http/http_client)).
:- use_module(library(http/http_json)).

% -------------- Read Relationships ----------------------
:- consult('../../sw02/ex1/main.pl').
:- consult('./sudoku.pl').


solve(ProblemType, ID) :-
    format(atom(BaseUrl), 'http://localhost:16316/problem/~w', [ProblemType]),
    format(atom(URL), '~w/~w', [BaseUrl, ID]),
    http_get(URL, Reply, []),
    solve(ProblemType, ID, BaseUrl, Reply).

%------------------- Sudoku ------------------------------------
solve(sudoku, ID, BaeUrl, Reply) :-
    parse(sudoku, Reply, Rows),
    Rows =[A, B, C, D, E, F, G, H, I],
    call(sudoku,[A, B, C, D, E, F, G, H, I]),
    Solution = json(json([id=ID, solution=Rows])),
    http_post(BaeUrl, Solution, _Reply, []).

% ----------------------- Relationship ---------------------------
solve(relationship, ID, BaseUrl, Reply) :-
    parse(relationship, Reply, RelationShip, Person1, Person2),
    call(RelationShip, Person1, Person2),
    http_post(BaseUrl, json(json([id=ID,solution=true])), _, []),
    !.

solve(relationship, ID, BaseUrl, _) :-
    http_post(BaseUrl, json(json([id=ID,solution=false])), _, []).


parse(relationship, JSON, RelationShip, Person1, Person2) :-
    JSON = json([_,firstPerson=Person1 | _]),
    JSON = json([_,_,relationship=RelationShip | _]),
    JSON = json([_,_,_,secondPerson=Person2 | _]).

parse(sudoku, JSON, Rows) :-
    JSON = json([_,sudoku=RowsWith0 | _]),
    maplist(replace_0, RowsWith0, Rows).

replace_0([],[]).
replace_0([0 | Tail], [_ | L]) :-
    !,
    replace_0(Tail, L).
replace_0([X | Tail], [X | L]) :-
    replace_0(Tail, L).
