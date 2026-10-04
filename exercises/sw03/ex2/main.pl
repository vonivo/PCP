:- dynamic fak_as/2.
fak(0,1).
fak(1,1).
fak(N, Res) :-
    fak_as(N, Res),
    write('(Hinweis: Fakultät von '),
    write(N),
    write(' war gespeichert)') , !.
fak(N, Res) :-
    N > 1,
    N1 is N - 1,
    fak(N1, Res1),
    Res is N * Res1,
    asserta(fak_as(N, Res)).

fak_clear :-
    retractall(fak_as(_, _)),
    write('(Hinweis: Alle gespeicherten Werte wurden gelöscht)').