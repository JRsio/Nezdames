/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author reya
 */

public class ContratTravail implements Serializable
{
    
    private boolean edition;
    private String numeroContratTravail;
    private String role;
    private String debut;
    private int heures;
    private int nombreHeures;
    private String representation;
    private String dateCrea;
    private ArrayList <ContratTravail> lesContrat ;
    private ContratCession leContratCession;
    private Intermittent lIntermittent;


    public ContratTravail(String role, String debut, int heures, int nombreHeures, String dateCrea) {
        this.role = role;
        this.debut = debut;
        this.heures = heures;
        this.nombreHeures = nombreHeures;
        this.dateCrea = dateCrea;
        lesContrat = new ArrayList <ContratTravail>() ;
        

    }

    public void setNumeroContratTravail(String numeroContratTravail) {
        this.numeroContratTravail = numeroContratTravail;
    }

    public String getNumeroContratTravail() {
        return numeroContratTravail;
    }
     public void modifier(String role, String debut, int heures, int nombreHeures, String dateCrea) {
        this.role = role;
        this.debut = debut;
        this.heures = heures;
        this.nombreHeures = nombreHeures;
        this.dateCrea = dateCrea;
     }

    public Intermittent getlIntermittent() {
        return lIntermittent;
    }

    public void setlIntermittent(Intermittent lIntermittent) {
        this.lIntermittent = lIntermittent;
    }

    


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDebut() {
        return debut;
    }

    public void setDebut(String debut) {
        this.debut = debut;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }


    public String getDateCrea() {
        return dateCrea;
    }

    public void setDateCrea(String dateCrea) {
        this.dateCrea = dateCrea;
    }

    public ArrayList<ContratTravail> getLesContrat() {
        return lesContrat;
    }

    public void setLesContrat(ArrayList<ContratTravail> lesContrat) {
        this.lesContrat = lesContrat;
    }
    
    public void ajouterContrat (ContratTravail unContrat) {
        lesContrat.add(unContrat);
    }
    
    public void supprimerRepresentation (int numeroContratTravail) {
        lesContrat.remove(numeroContratTravail); //problème dû à l'id d'une représentation
    }
    
    public int donnerNombreRepresentation() {
        return lesContrat.size();
    }
    
 /*   public Representation getPremiereRepresentation () throws ParseException {
        //on recherche la première représentation pour ce contrat de production
        if (lesContrat.isEmpty()) {
            return null; 
        }
        else {
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            //on initialise la première représentation comme étant la première de la collection
            Date plusPetiteDate = dt.parse(lesRepresentations.get(0).getDate());
            Representation premiereRepresentation = lesRepresentations.get(0);
            //on cherche la véritable première représentation dans la collection
            for (Representation uneRepresentation : lesRepresentations) {
                Date laDateCourante = dt.parse(uneRepresentation.getDate());
                if (laDateCourante.before(plusPetiteDate)) {
                    plusPetiteDate = laDateCourante;
                    premiereRepresentation = uneRepresentation;
                }
            }
            return premiereRepresentation;
        } 
    } */

    
    @Override
    public String toString() {
        return "ContratTravail{" + "numeroContratTravail=" + numeroContratTravail 
                + ", role=" + role 
                + ", nombreHeures=" + nombreHeures 
                + ", edition=" + edition 
                + ", lesRepresentations=" + lesContrat 
                + ", l'Intermittent=" + lIntermittent 
                + " le contrat Cession =" + leContratCession + '}';
    }
}
