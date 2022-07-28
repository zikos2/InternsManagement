package um5.fmp.stages.gestion_stages.services;

import java.util.List;


import um5.fmp.stages.gestion_stages.models.Admin;
import um5.fmp.stages.gestion_stages.models.Annonce;
import um5.fmp.stages.gestion_stages.models.Document;
import um5.fmp.stages.gestion_stages.models.EmplacementStage;
import um5.fmp.stages.gestion_stages.models.Encadrant;
import um5.fmp.stages.gestion_stages.models.Etudiant;
import um5.fmp.stages.gestion_stages.models.Niveau;
import um5.fmp.stages.gestion_stages.models.Stage;

public interface AdminService {
	//afficher les entites:
	
	public List<Etudiant> listEtudiant();
	public List<Encadrant> listEncadrant();
	public List<Admin> listAdmin();
	public List<Stage> listStage();
	public List<Annonce> listAnnonce();
	public List<Document> listDocuments();
	public List<EmplacementStage> listEmplacement();
	public List<Niveau> listNiveau();
	
/*--------------------------------------------------------------------------------
	findbyID*/
	
	public Etudiant getEtudiant( long id);
	public Encadrant getEncadrant(long id);
	public Admin getAdministrateur(long id);
	public Stage getStage(long id);
	public Annonce getAnnonce(long id);
	public Document getDocument(long id);
	public EmplacementStage getEmplacement(long id);
	public Niveau getNiveau(long id);
	
/*---------------------------------------------------------------------------------
	ajout*/
	public Boolean ajouterEtudiant(Etudiant e);
	public Boolean ajouterEncadrant(Encadrant e);
	public Boolean ajouterAdmin(Admin a);
	public Boolean ajouterStage(Stage s);
	public Boolean ajouterAnnonce(Annonce a);
	public Boolean ajouterEmplacement(EmplacementStage e);
	 public Boolean ajouterNiveau(Niveau s);
	

/*---------------------------------------------------------------------------------
    modification*/
	public Boolean modifierEtudiant(Etudiant e);
	public Boolean modifierEncadrant(Encadrant e);
	public Boolean modifierAdmin(Admin a);
	public Boolean modifierStage(Stage s);
	public Boolean modifierAnnonce(Annonce a);
	public Boolean modifierEmplacement(EmplacementStage e);
	
	
/*----------------------------------------------------------------------------------	
    suppression */
	public Boolean deleteEtudiant( long id);
	public Boolean deleteEncadrant(long id);
	public Boolean deleteAdministrateur(long id);
	public Boolean deleteStage(long id);
	public Boolean deleteAnnonce(long id);
	public Boolean deleteEmplacement(long id);
	
/*-----------------------------------------------------------------------------------	
    affectation */
	public Boolean assignLevelToStudent(long idStudent, long idLevel);
	public Boolean assignLevelToTeacher(long idTeacher, long idLevel);
	public Boolean assignLevelToStage(long idStage, long idLevel);
	
/*------------------------------------------------------------------------------------
 	desaffectation*/
	public Boolean removeLevelStudent(long idStudent);
	public Boolean removeLevelTeacher(long idTeacher);
	public Boolean removeLevelStage(long idStage , long idNiveau);
	

}
