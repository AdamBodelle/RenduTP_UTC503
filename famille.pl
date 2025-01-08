/******************************************************************************

                            Online Prolog Compiler.
                Code, Compile, Run and Debug Prolog program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


% Déclarations de faits et règles
homme('pierre').
homme('marc').
homme('paul').
homme('jacques').
femme('marie').
femme('sophie').
femme('julie').

parent('pierre', 'paul').
parent('marie', 'paul').
parent('marc', 'sophie').
parent('julie', 'sohpie').
parent('jacques', 'marc').
parent('jacques', 'marie').


pere(X,Y) :- homme(X), parent(X,Y).
mere(X,Y) :- femme(X), parent(X,Y).
frere(X,Y) :- homme(X), parent(Z,X), parent(Z,Y), not(X=Y).
soeur(X,Y) :- femme(X), parent(Z,X), parent(Z,Y), not(X=Y).
grandparent(X, Y) :- parent(X, Z), parent(Z, Y).
oncle(X,Y) :- homme(X), frere(X,Z), parent(Z,Y).
tante(X,Y) :- femme(X), soeur(X,Z), parent(Z,Y).
frere_soeur(X,Y) :- parent(Z,X), parent(Z,Y), not(X=Y).
cousin(X,Y) :- parent(Z,X), frere_soeur(Z,W), parent(W,Y).

longueur([], 0).
longueur([_ | Queue], N) :- longueur(Queue, M), N is M + 1.

present(X, L) :- member(X, L).



% Initialisation
:- initialization(main).

main :-
    (   pere('marcel', 'jacques') ->
        writeln('Yes, Pierre is the grandparent of Jacques.');
        writeln('No, Pierre is not the grandparent of Jacques.')
    ).
