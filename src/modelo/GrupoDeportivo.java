package modelo;
// Generated 10/10/2020 11:26:52 AM by Hibernate Tools 4.3.1



/**
 * GrupoDeportivo generated by hbm2java
 */
public class GrupoDeportivo  implements java.io.Serializable {


     private int cscIntentos;
     private Especialista especialistaByEspIdEspecialista;
     private Especialista especialistaByIdEspecialista;
     private int intento;

    public GrupoDeportivo() {
    }

    public GrupoDeportivo(int cscIntentos, int intento) {
        this.cscIntentos = cscIntentos;
        this.intento = intento;
    }

    public GrupoDeportivo(int cscIntentos) {
        this.cscIntentos = cscIntentos;
    }
    
    

    public GrupoDeportivo(int cscIntentos, Especialista especialistaByEspIdEspecialista, Especialista especialistaByIdEspecialista, int intento) {
       this.cscIntentos = cscIntentos;
       this.especialistaByEspIdEspecialista = especialistaByEspIdEspecialista;
       this.especialistaByIdEspecialista = especialistaByIdEspecialista;
       this.intento = intento;
    }
   
    public int getCscIntentos() {
        return this.cscIntentos;
    }
    
    public void setCscIntentos(int cscIntentos) {
        this.cscIntentos = cscIntentos;
    }
    public Especialista getEspecialistaByEspIdEspecialista() {
        return this.especialistaByEspIdEspecialista;
    }
    
    public void setEspecialistaByEspIdEspecialista(Especialista especialistaByEspIdEspecialista) {
        this.especialistaByEspIdEspecialista = especialistaByEspIdEspecialista;
    }
    public Especialista getEspecialistaByIdEspecialista() {
        return this.especialistaByIdEspecialista;
    }
    
    public void setEspecialistaByIdEspecialista(Especialista especialistaByIdEspecialista) {
        this.especialistaByIdEspecialista = especialistaByIdEspecialista;
    }
    public int getIntento() {
        return this.intento;
    }
    
    public void setIntento(int intento) {
        this.intento = intento;
    }

    @Override
    public String toString() {
        return "GrupoDeportivo{" + "cscIntentos=" + cscIntentos + ", intento=" + intento + '}';
    }

    




}

