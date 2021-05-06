package PartidaNormal;

/**
 *
 * @author david
 */
import java.util.ArrayList;

public class Planeta {
    // Atributs

    ArrayList<Integer> objetivos = new ArrayList<Integer>();
    ArrayList<Integer> cantidadAtk = new ArrayList<Integer>();
    private int numEquipos;
    private int vidas;
    private int vidasBase;
    private int misilesRonda;
    private int misilesBase;
    private int misilesDefensa;
    private int tipoPlaneta;
    private int vidasBaseCargar;
    private int misilesCargar;

    private String nombreEquipo;
    private String nombreTipo;
    private String nombreMasTipo;

    public Planeta(String nombre, int tipoPlaneta, boolean cargar, int vidasCargar, int misilesCargar) {

        this.nombreEquipo = nombre;
        this.tipoPlaneta = tipoPlaneta;
        this.numEquipos++;

  
        switch (tipoPlaneta) {
            case 0: // Planeta Normal
                this.nombreTipo = "(Normal)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 1: // Planeta Rojo
                this.nombreTipo = "(Rojo)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 2: // Planeta Azul
                this.nombreTipo = "(Azul)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 3: // Planeta Verde
                this.nombreTipo = "(Verde)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 4: // Planeta Gigante Gaseoso
                this.nombreTipo = "(Gaseoso)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 400;
                this.vidasBase = this.vidas;
                this.misilesRonda = 10;
                this.misilesBase = this.misilesRonda;
                break;
            case 5: // Planeta Enano
                this.nombreTipo = "(Enano)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 100;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;
                break;
            case 6: // Planeta berserk
                this.nombreTipo = "(Berserk)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 100;
                this.vidasBase = this.vidas;
                this.misilesRonda = 150;
                this.misilesBase = this.misilesRonda;
                break;
            case 7: // Planeta Oscuro
                this.nombreTipo = "(Oscuro)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;
                break;

            case 8: // Planeta Vegeta Super Saiyan 2
                this.nombreTipo = "(Vegeta Super Saiyan 2)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 100;
                this.vidasBase = this.vidas;
                this.misilesRonda = 30;
                this.misilesBase = this.misilesRonda;
                break;
            case 9: // Planeta Nigromante
                this.nombreTipo = "(Nigromante)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 175;
                this.vidasBase = this.vidas;
                this.misilesRonda = 40;
                this.misilesBase = this.misilesRonda;
                break;
        }
        
        if(cargar){
            this.vidas = vidasCargar;
            this.misilesRonda = misilesCargar;
            this.misilesBase = misilesCargar;
        }
        

    }

    public int ventajasColores(int tipoObjetivo, int magnitudAtaque) {
        if (this.tipoPlaneta == 1) { // Condiciones equipo rojo
            if (tipoObjetivo == 3) { // Equipo verde, atk*2
                magnitudAtaque = magnitudAtaque * 2;
            } else if (tipoObjetivo == 2) { // Equipo azul, atk/2
                magnitudAtaque = magnitudAtaque / 2;
            }
        }

        if (this.tipoPlaneta == 2) { // Condiciones equipo azul
            if (tipoObjetivo == 1) { // Equipo rojo, atk*2
                magnitudAtaque = magnitudAtaque * 2;
            } else if (tipoObjetivo == 3) { // Equipo verde, atk/2
                magnitudAtaque = magnitudAtaque / 2;
            }
        }

        if (this.tipoPlaneta == 3) { // Condiciones equipo verde
            if (tipoObjetivo == 2) { // Equipo azul, atk*2
                magnitudAtaque = magnitudAtaque * 2;
            } else if (tipoObjetivo == 1) { // Equipo rojo, atk/2
                magnitudAtaque = magnitudAtaque / 2;
            }
        }

        return magnitudAtaque;
    }

    public int planetaEnano() {
        int chanceEsquivar;
        int min = 0;
        int max = 1;

        chanceEsquivar = (int) (Math.random() * (max - min + 1)) + min;

        return chanceEsquivar;
    }

    public int calcularDmg(int misiles) {
        if (misiles >= misilesDefensa) {
            this.vidas = this.vidas - misiles + this.misilesDefensa;
        } else {
            return this.vidas;
        }
        if (this.vidas < 0) {
            this.vidas = 0;
        }
        misilesDefensa = 0;

        return this.vidas;
    }
    

    public int defender(int misiles) {
        misiles = misiles / 2;
        this.misilesDefensa = misiles;

        return this.misilesDefensa;
    }

    public int usarMisiles(int misiles) {
        this.misilesRonda = this.misilesRonda - misiles;

        return this.misilesRonda;
    }

    public void resetMisiles() { // Resetea los misiles para una nueva ronda.
            this.misilesRonda = this.misilesBase;
    }

    public void pasivaGaseoso() {
        this.misilesBase = this.misilesBase + 10;
        this.misilesRonda = this.misilesBase;
    }

    public void pasivaNigromante(int equiposMuertos) { // Activa la pasiva de los planetas tipo Nigromante.
        int x;

        if (equiposMuertos > 0) {
            for (x = 0; x < equiposMuertos; x++) {
                this.misilesBase = this.misilesBase + 20;
                this.vidas = this.vidas + 40;
                System.out.println("El nigromante recibe 20 misiles y se cura 40 de vida por cada equipo muerto.");
            }
            if (this.vidas > this.vidasBase) { // No permitimos que se cure más de sus vidas base.
                this.vidas = this.vidasBase;
            }
        }
    }

    public void pasivaVegeta(int cantidadEquipos, int tipoEquipo) { // Activa la pasiva del Planeta Vegeta
        int x;

        if (tipoEquipo == 8) {
            for (x = 0; x < (cantidadEquipos - 1); x++) { // Se le resta 1 a cantidadEquipos para no contarse a si mismo.
                this.vidasBase = this.vidasBase + 100;
                this.vidas = this.vidasBase;
                this.misilesBase = this.misilesBase + 10;
                this.misilesRonda = this.misilesBase;
            }
        }
    }

    public int resetDefensa() {
        this.misilesDefensa = 0;
        return misilesDefensa;
    }

    // FUNCIONES ARRAYLIST
    public void introducirObjetivo(int objetivo) {
        this.objetivos.add(objetivo);

    }

    public void introducirAtaque(int cantidadAtaque) {
        this.cantidadAtk.add(cantidadAtaque);
    }
    
    public void sumarAtaque(int cantidadAtaque, int posicion) {
        this.cantidadAtk.set(posicion, (this.cantidadAtk.get(posicion) + cantidadAtaque));
    }

    public void resetArrays() {
        this.objetivos.clear();
        this.cantidadAtk.clear();

    }

    // GETTERS Y SETTERS
    // VIDAS
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    // PROPIEDAD VIVO
    public boolean isVivo() {
        return vidas > 0;
    }

    // NOMBRE EQUIPO
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    // NUMERO DE EQUIPOS
    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    // MISILES
    public int getMisilesRonda() {
        return misilesRonda;
    }

    public void setMisilesRonda(int misilesRonda) {
        this.misilesRonda = misilesRonda;
    }

    public int getMisilesBase() {
        return misilesBase;
    }

    public void setMisilesBase(int misilesRonda) {
        this.misilesBase = misilesRonda;
    }

    // MISILES DE DEFENSA DE LA RONDA
    public int getMisilesDefensa() {
        return misilesDefensa;
    }

    public void setMisilesDefensa(int misilesDefensa) {
        this.misilesDefensa = misilesDefensa;
    }

    // TIPO DEL EQUIPO
    public int getTipoPlaneta() {
        return tipoPlaneta;
    }

    // NOMBRE DEL EQUIPO + TIPO
    public String getNombreMasTipo() {
        return nombreMasTipo;
    }

    // NOMBRE DEL TIPO
    public String getNombreTipo() {
        return nombreTipo;
    }

    public int getVidasBase() {
        return this.vidasBase;
    }

    // Arraylist
    public ArrayList<Integer> getObjetivos() {
        return objetivos;
    }
    
    public int getObjetivoPosicion(int x) {
        return objetivos.get(x);
    }

    public void setObjetivos(ArrayList<Integer> objetivos) {
        this.objetivos = objetivos;
    }

    public ArrayList<Integer> getCantidadAtk() {
        return cantidadAtk;
    }

    public void setCantidadAtk(ArrayList<Integer> cantidadAtk) {
        this.cantidadAtk = cantidadAtk;
    }
    


}
