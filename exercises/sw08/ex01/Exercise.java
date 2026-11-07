package sw08.ex01;

public class Exercise implements GeneralInterface, SpecificInterface{
    public static void main(String[] args) {
        Exercise ex1 = new Exercise();
        ex1.doIt();
    }

    /* @Override
    public void doIt() {
        SpecificInterface.super.doIt();
    }*/
}


//---------- a) ------------
// > Do it the SPECIFIC way.


//---------- b) ------------
// Dies führt zu keinem Problem, da SpecificInterface
// das GeneralInterface spezialisiert und die Methode
// überschreibt. Daher wird auch die Implementation von
// SpecificInterface genommen.

//---------- c) ------------
// Ja das gäbe dann ein Problem, da der Compiler nicht weiss,
// welche implementation der Methode gewählt werden soll.
// Lösen kann man das mit einem Overwrite in der Klasse und
// mit dem Interface.super.doIt(); Syntax.

// Error: java: types sw08.ex01.GeneralInterface and sw08.ex01.SpecificInterface are incompatible;
//  class sw08.ex01.Exercise inherits unrelated defaults for doIt() from types sw08.ex01.GeneralInterface and sw08.ex01.SpecificInterface