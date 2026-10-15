:- use_module(library(clpr)).

fib_clp(N, F) :- { N = 0, F = 0 }.
fib_clp(N, F) :- { N = 1, F = 1 }.
fib_clp(N, F) :-
    { N >= 2, F = F1 + F2, N1 = N - 1, N2 = N - 2 },
    fib_clp(N1, F1),
    fib_clp(N2, F2).


% --------------- a)
% Das Problem manifestiert sich in einer Endlosen Rekursion.
%---------------- b)
% Das Problem tritt aus folgendem Grund auf. Damit Prolog beweisen kann, dass  z.B. 6 keine Fibonacci-Zahl ist,
% muss es alle Fibnoacci-Zahlen berechnen um zu überprüfen ob 6 keine davon ist. Daher wächst auch
% der stack ins unnednliche. Als Mensch wissen wir das N und F streng monoton steigen und dadruch
% sehen wir, dass (bei z.B N=?, F=6) F keine Fibonacci Zahl ist, wenn wir ein N_x finden welches F_x > F ist und bisher
% nichts gefunden haben dass F keine Fibonacci Zahl ist.

fib_clp_fixed(N, F) :-
    { N >= 0, F >= 0 },
    fib_clp_fixed(0, 0, 1, N, F).

fib_clp_fixed(Index, Fib_Index, _, N, F) :-
    { Index = N, Fib_Index = F }.

fib_clp_fixed(Index, Fib_Index, Next_Fib, N, F) :-
    { Index < N, Fib_Index =< F },
    { Next_Index = Index + 1 },
    { S = Fib_Index +  Next_Fib},
    fib_clp_fixed(Next_Index, Next_Fib, S, N, F).