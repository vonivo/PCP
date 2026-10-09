:- use_module(library(clpfd)).

sudoku(Rows) :-
    append(Rows, Vs), Vs ins 1..9,
    maplist(all_distinct, Rows),
    transpose(Rows, Columns),
    maplist(all_distinct, Columns),
    Rows = [A, B, C, D, E, F, G, H, I],
    blocks(A, B, C), blocks(D, E, F), blocks(G, H, I),
    maplist(label, Rows).

blocks([], [], []).
blocks([J, K, L|Bs1], [M, N, O|Bs2], [P, Q, R|Bs3]) :-
    all_distinct([J, K, L, M, N, O, P, Q, R]),
    blocks(Bs1, Bs2, Bs3).