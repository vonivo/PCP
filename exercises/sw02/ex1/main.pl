female(mary).                   % f1
female(liz).                    % f2
female(mia).                    % f3
female(tina).                   % f4
female(ann).                    % f5
female(sue).                    % f6
male(mike).                     % f7
male(jack).                     % f8
male(fred).                     % f9
male(tom).                      % f10
male(joe).                      % f11
male(jim).                      % f12
parent(mary, mia).              % f13
parent(mary, fred).             % f14
parent(mary, tina).             % f15
parent(mike, mia).              % f16
parent(mike, fred).             % f17
parent(mike, tina).             % f18
parent(liz, tom).               % f19
parent(liz, joe).               % f20
parent(jack, tom).              % f21
parent(jack, joe).              % f22
parent(mia, ann).               % f23
parent(tina, sue).              % f24
parent(tina, jim).              % f25
parent(tom, sue).               % f26
parent(tom, jim).               % f27

% ---------------- a)---------------------------
father(Father, Child) :- male(Father), parent(Father, Child).       % r1
mother(Mother, Child) :- female(Mother), parent(Mother, Child).     % r2

% Queries from a)
% mother(X, jim)
% father(X, jim)
% parent(mary, X)

% ---------------- b)---------------------------
sibling(X, Y) :- father(Father, X), father(Father, Y),
                 mother(Mother, X), mother(Mother, Y).

% ---------------- C)---------------------------
grandmother(Grandmother, Grandchild) :- mother(Grandmother, Parent), parent(Parent, Grandchild).       % r3

% grandmother(X, jim) --> X=marry;X=liz.

% ---------------- C)---------------------------
offspring(Offspring, Ancestor) :- parent(Ancestor, Offspring).                                         % r4
offspring(Offspring, Ancestor) :- parent(Person, Offspring), offspring(Person, Ancestor).              % r5
