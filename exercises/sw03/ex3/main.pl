add_tail(X, [], [X | []]).
add_tail(X, [Head | Tail], [Head | L1]) :-
    add_tail(X, Tail, L1).


del([],_,[]).
del([X | Tail], X, L) :-
    !,
    del(Tail, X, L).
del([Y| Tail1], X, [Y|Tail2]) :-
    del(Tail1, X, Tail2).


mem_d(X, L) :- del(L, X, L1), L \= L1.

rev(L, R) :- rev_acc(L, [], R).
rev_acc([], Acc, Acc).
rev_acc([Head1 | LTail], A, R) :-
    rev_acc(LTail, [Head1 | A], R).



