import com.sun.source.tree.TryTree;

import java.text.ParseException;
import java.util.ArrayList;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Main {
        public static void main(String[] args) {

            /**
             * alternativa senza classe per ottenere ArrayList di oggetti Persona
             *
             *  ArrayList<Persona> userList = new ArrayList<>();
             *  userList.add (new Persona("lili", 20, "GT$%"));
             */
            AddTestPersone ListaTest = new AddTestPersone();

            try {
                ListaTest.AddPersona(new Persona("Mimi", 88, "MI88",
                        new SimpleDateFormat("yyyy/MM/dd").parse("1980/07/05"), ""));
                ListaTest.AddPersona(new Persona("Simo", 38, "SI38",
                        new SimpleDateFormat("MM/dd/yyyy").parse("06/05/1980"),""));
                ListaTest.AddPersona(new Persona("Topo", 10, "TO10",
                        new SimpleDateFormat("dd/MM/yyyy").parse("05/07/1980"), ""));
                ListaTest.AddPersona(new Persona("Pluto", 25, "PL25",
                        new SimpleDateFormat("dd-MM-yyyy").parse("05-06-1980"), ""));
            }
            catch(ErrorePersona | ParseException e) {
                System.out.println(e.getMessage());
            }

           //System.out.println(ListaTest.StampaLista()) ;
            /*
            try {
                System.out.println((ListaTest.StampaListaNatiNell(new SimpleDateFormat("dd/MM/yyyy").parse("05/07/1980"))));
            }
            catch(ParseException e){
                System.out.println(e.getMessage());
            }//*/

            System.out.println(ListaTest.StampaPesoneNatiNellMese(6));

      } // end main

    }//end Class main

