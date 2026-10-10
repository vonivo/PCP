set_difference([], _, []).
set_difference([Head | Set1], Set2, [Head | Set3]) :-
    \+ member(Head, Set2),
    set_difference(Set1, Set2, Set3).
set_difference([Head | Set1], Set2, Set3) :-
    member(Head, Set2),
    set_difference(Set1, Set2, Set3).
