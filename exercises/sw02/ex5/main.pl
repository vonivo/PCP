female(mary). female(liz). female(mia). female(tina). female(ann). female(sue).             % all females
male(mike). male(jack). male(fred). male(tom). male(joe). male(jim).                        % all males
parent(mary, mia). parent(mary, fred). parent(mary, tina).                                  % all childern of mary
parent(mike, mia). parent(mike, fred). parent(mike, tina).                                  % all children of mike
parent(liz, tom). parent(liz, joe).                                                         % allchildern of liz
parent(jack, tom). parent(jack, joe).                                                       % all childern of jack
parent(mia, ann).                                                                           % all childern of mia
parent(tina, sue). parent(tina, jim).                                                       % all childern of tina
parent(tom, sue). parent(tom, jim).                                                         % all childern of tom

father(Father, Child) :- male(Father), parent(Father, Child).
mother(Mother, Child) :- female(Mother), parent(Mother, Child).

sibling(X, Y) :- father(Father, X), father(Father, Y),
                 mother(Mother, X), mother(Mother, Y).

grandmother(Grandmother, Grandchild) :- parent(Parent, Grandchild), mother(Grandmother, Parent).

offspring(Offspring, Ancestor) :- parent(Ancestor, Offspring).
offspring(Offspring, Ancestor) :- parent(Person, Offspring), offspring(Person, Ancestor).


%----------- a) ----------------
:- op(1200, xfx, mother).
%----------- b) ----------------
:- op(1200, xfx, offspring).

