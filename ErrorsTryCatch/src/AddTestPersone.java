import java.util.ArrayList;
import java.util.Date;

public class AddTestPersone {

    public static ArrayList<Persona> ListaPersone;
    public AddTestPersone(){
        ListaPersone = new ArrayList<Persona>();
    }
    public void AddPersona(Persona nuovaPersona){
        boolean esisteGia = false;
        for (Persona personaInLista : ListaPersone){
            if(personaInLista.getCF()== nuovaPersona.getCF()){
                esisteGia = true;
            } //end of if in for
        } //end for

        if (esisteGia){
            throw new ErrorePersona(nuovaPersona.getNome() + " esiste gia!");
        }
        else {ListaPersone.add(nuovaPersona);};
    };// end of AddPersona

    public String StampaLista () {
        String out="";
        for (Persona personaStampata : ListaPersone)
            //out = out + personaStampata.stampaTutto() + "\n";
            out += personaStampata.stampaTutto() + "\n";
        return out;
    }// end of StampaLista

    public String StampaListaNatiNell (Date dataDaVerificare){
        String out="";
        //personaNataNell e nome scelto a caso per ciclo for
        for (Persona personaNataNell: ListaPersone){
            if (personaNataNell.getDataNascita().equals(dataDaVerificare)){
                out += personaNataNell.stampaTutto() + "\n";
            }//end of if
        }//end of for
        return out;
    }//end of StampaListaNatiNell

    public String StampaPesoneNatiNellMese (Integer meseDaVerificare){
        String out="";
        boolean primoTrovato = true;
        for (Persona personaNataMese: ListaPersone){
            if (personaNataMese.getDataNascita().getMonth()==(meseDaVerificare)-1){
                if (primoTrovato){
                    personaNataMese.setSopranome("natoNellMese "+ meseDaVerificare.toString());
                    primoTrovato=false;
                }
                out += personaNataMese.stampaTutto() + "\n";
            }//end of if

        }//endo of for
        return out;
    }// end of StampaPesoneNatiNellMese

}//end of class
