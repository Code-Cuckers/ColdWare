/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColdWar;

/**
 *
 * @author Haru
 */
public class Planeta {
    // Atributs

    private int ataques;
    private int numEquipos;
    private int vidas;
    private int vidasBase;
    private int misilesRonda;
    private int misilesBase;

    private int misilesDefensa;
    private int posicionEquipo;
    private int tipoPlaneta;

    private boolean vivo;
    private String nombreEquipo;
    private String nombreTipo;
    private String nombreMasTipo;

    public Planeta(int x) {

        this.tipoPlaneta = tipoPlaneta;
        this.numEquipos++;
        this.vivo = true;

        switch (tipoPlaneta) {
            case 1: // Planeta Normal
                this.nombreTipo = "(Normal)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 2: // Planeta Rojo
                this.nombreTipo = "(Rojo)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 3: // Planeta Azul
                this.nombreTipo = "(Azul)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 4: // Planeta Verde
                this.nombreTipo = "(Verde)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;

                break;
            case 5: // Planeta Gigante Gaseoso
                this.nombreTipo = "(Gaseoso)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 400;
                this.vidasBase = this.vidas;
                this.misilesRonda = 0;
                this.misilesBase = this.misilesRonda;
                break;
            case 6: // Planeta Enano
                this.nombreTipo = "(Enano)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 100;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;
                break;
            case 7: // Planeta berserk
                this.nombreTipo = "(Berserk)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 100;
                this.vidasBase = this.vidas;
                this.misilesRonda = 150;
                this.misilesBase = this.misilesRonda;
                break;
            case 8: // Planeta Oscuro
                this.nombreTipo = "(Oscuro)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 200;
                this.vidasBase = this.vidas;
                this.misilesRonda = 50;
                this.misilesBase = this.misilesRonda;
                break;

            case 9: // Planeta Vegeta Super Saiyan 2
                this.nombreTipo = "(Vegeta Super Saiyan 2)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 100;
                this.misilesRonda = 30;
                this.misilesBase = this.misilesRonda;
                break;
            case 10: // Planeta Nigromante
                this.nombreTipo = "(Nigromante)";
                this.nombreMasTipo = this.nombreEquipo + " " + nombreTipo;
                this.vidas = 175;
                this.vidasBase = this.vidas;
                this.misilesRonda = 40;
                this.misilesBase = this.misilesRonda;
                break;

        }

    }
    
    public void setAtaques() {
         this.ataques = ataques;
    }
    
    public int getAtaques() {
        return ataques;
    }
    
   
    
}
