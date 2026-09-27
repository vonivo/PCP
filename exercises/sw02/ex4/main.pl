n(gelb,rot).
n(rot,gelb).
n(gelb,gruen).
n(gruen,gelb).
n(rot,gruen).
n(gruen,rot).

color(LU,NW,OW,SZ,UR,ZG) :-
    UR=gelb,
    SZ=rot,
    n(SZ,ZG), n(SZ,LU), n(SZ,NW), n(SZ, UR),    % neighbours of SZ
    n(ZG, LU),                                  % neighbours of ZG
    n(LU, OW), n(LU,NW),                        % neighbours of LU
    n(OW,NW), n(OW,UR),                         % neighbours of OW
    n(NW,UR).                                   % neighbours of UR

% LU = UR, UR = gelb,
% NW = ZG, ZG = gruen,
% OW = SZ, SZ = rot ;
% false.