    import java.util.ArrayList;
    import java.time.*;
    import java.util.Date;
    import java.text.SimpleDateFormat;

    public class Persona {
        private String nome;
        private int eta;
        private String CF;
        private Date dataNascita;
        private String sopranome;

        public Persona(java.lang.String nome, int eta, java.lang.String CF, Date dataNascita, String sopranome) {
            this.nome = nome;
            this.eta = eta;
            this.CF = CF;
            this.dataNascita = dataNascita;
            this.sopranome = sopranome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getEta() {
            return eta;
        }

        public void setEta(int eta) {
            this.eta = eta;
        }

        public String getCF() {
            return CF;
        }

        public void setCF(String CF) {
            this.CF = CF;
        }

        public Date getDataNascita() {
            return dataNascita;
        }

        public void setDataNascita(Date dataNascita) {
            this.dataNascita = dataNascita;
        }

        public String getSopranome() {
            return sopranome;
        }

        public void setSopranome(String sopranome) {
            this.sopranome = sopranome;
        }

        public String stampaTutto(){
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
           return this.nome +" " + String.valueOf(this.eta)+ " " + this.CF + " " +
                   formatter.format(this.dataNascita) + " " + this.sopranome;
        }


    } //end of class

