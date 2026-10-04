mem(X, [X | _]).
mem(X, [_ | Tail]) :- mem(X, Tail).

% ?- L = [_,_,_], member(a,L), member(b,L), member(c,L), !.
% Ein Redkut verändert zusätzlich zur Prozeduralen Bedeutung
% auch die Deklarative Bedeutung. Dadruch wird dann auch der
% Lösungsraum verändert.