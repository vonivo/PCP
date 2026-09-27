mult(0,_,0).
mult(_,0,0).
mult(X,Y,Z) :-
    Y > 0,              % Über diesen Guard.
    Y1 is Y - 1,
    mult(X,Y1,Z1),
    Z is X + Z1.


% Ohne den Guard findet Prolog die erste Lösung wie erwartet
% da bei mult(4,0,0) gefunden wird. Bei der Eingabe von ';' wird
% weiter gesucht und Prolog geht dann in mult(X,Y,Z) rein was einen
% rekursieven Aufruf von mult(4,-1,X) verursacht und das geht dann
% so weiter bis zur Meldung.