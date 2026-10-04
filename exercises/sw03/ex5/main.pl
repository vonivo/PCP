warn(T) :- T < 80, write('Temperatur ok'), !.
warn(T) :- T < 100, T >= 80, write('Temperatur sehr warm'), !.
warn(T) :- T >= 100, write('Temperatur zu heiss').

% Optimierung des Backtracking.
% Wenn alle Resultate abgefragt werden, muss bei der Option ohne Cut
% alle drei Regeln abgefragt werden. Da aber die Relgen mutually exclusive sind, kann der
% Fall, dass zwei Regeln richtig sind garnicht eintreffen.