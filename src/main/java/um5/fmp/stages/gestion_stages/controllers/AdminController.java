package um5.fmp.stages.gestion_stages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import um5.fmp.stages.gestion_stages.models.Admin;
import um5.fmp.stages.gestion_stages.models.Annonce;
import um5.fmp.stages.gestion_stages.models.Document;
import um5.fmp.stages.gestion_stages.models.EmplacementStage;
import um5.fmp.stages.gestion_stages.models.Encadrant;
import um5.fmp.stages.gestion_stages.models.Etudiant;
import um5.fmp.stages.gestion_stages.models.Niveau;
import um5.fmp.stages.gestion_stages.models.Stage;

import um5.fmp.stages.gestion_stages.services.AdminService;
@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	//afficher les entites:
	
	@GetMapping("/etudiants")
	public List<Etudiant> listEtudiant() {
		return adminService.listEtudiant();
	}
	
	@GetMapping("/encadrants")
	public List<Encadrant> listEncadrant() {
		return adminService.listEncadrant();
	}
	@GetMapping("/administrateurs")
	public List<Admin> listAdmin() {
		return adminService.listAdmin();
	}
	@GetMapping("/stages")
	public List<Stage> listStage() {
		return adminService.listStage();
	}
	@GetMapping("/annonces")
	public List<Annonce> listAnnonce() {
		return adminService.listAnnonce();
	}
	@GetMapping("/documents")
	public List<Document> listDocuments() {
		return adminService.listDocuments();
	}
	@GetMapping("/emplacements")
	public List<EmplacementStage> listEmplacement() {
		return adminService.listEmplacement();
	}
	@GetMapping("/niveau")
	public List<Niveau> listNiveau() {
		return adminService.listNiveau();
	}
	
	//find by id:
	
	@GetMapping("/etudiant/{id}")
	public Etudiant getEtudiant(@PathVariable long id) {
		return adminService.getEtudiant(id);
	}
	@GetMapping("/encadrant/{id}")
	public Encadrant getEncadrant(@PathVariable long id) {
		return adminService.getEncadrant(id);
	}
	@GetMapping("/admin/{id}")
	public Admin getAdministrateur(@PathVariable long id) {
		return adminService.getAdministrateur(id);
	}
	@GetMapping("/stage/{id}")
	public Stage getStage(@PathVariable long id) {
		return adminService.getStage(id);
	}
	@GetMapping("/annonce/{id}")
	public Annonce getAnnonce(@PathVariable long id) {
		return adminService.getAnnonce(id);
	}
	@GetMapping("/document/{id}")
	public Document getDocument(@PathVariable long id) {
		return adminService.getDocument(id);
	}
	@GetMapping("/emplacement/{id}")
	public EmplacementStage getEmplacement(@PathVariable long id) {
		return adminService.getEmplacement(id);
	}
	@GetMapping("/niveau/{id}")
	public Niveau getNiveau(@PathVariable long id) {
		return adminService.getNiveau(id);
	}
	
	//ajoute les entites:
	
	@PostMapping("/etudiant")
	public void ajouterEtudiant(@RequestBody Etudiant e) {
		adminService.ajouterEtudiant(e);
	}
	@PostMapping("/encadrant")
	public void ajouterEncadrant(@RequestBody Encadrant e) {
		adminService.ajouterEncadrant(e);
	}
	@PostMapping("/admin")
	public void ajouterAdmin(@RequestBody Admin a) {
		adminService.ajouterAdmin(a);
	}
	@PostMapping("/stage")
	public void ajouterStage(@RequestBody Stage s) {
		adminService.ajouterStage(s);
	}
	@PostMapping("/annonce")
	public void ajouterAnnoce(@RequestBody Annonce a) {
		adminService.ajouterAnnonce(a);
	}
	@PostMapping("/emplacement")
	public void ajouterEmplacementr(@RequestBody EmplacementStage e) {
		adminService.ajouterEmplacement(e);
	}
	@PostMapping("/niveau")
	public void ajouterNiveau(@RequestBody Niveau e) {
		adminService.ajouterNiveau(e);
	}
	
	
	
	//modifier les entites:
	@PutMapping("/etudiant")
	public void modifierEtudiant(@RequestBody Etudiant e) {
		adminService.modifierEtudiant(e);
	}
	@PutMapping("/encadrant")
	public void modifierEncadrant(@RequestBody Encadrant e) {
		adminService.modifierEncadrant(e);
	}
	@PutMapping("/admin")
	public void modifierEtudiant(@RequestBody Admin a) {
		adminService.modifierAdmin(a);
	}
	@PutMapping("/stage")
	public void modifierStage(@RequestBody Stage s) {
		adminService.modifierStage(s);
	}
	@PutMapping("/annonce")
	public void modifierAnnonce(@RequestBody Annonce a) {
		adminService.modifierAnnonce(a);
	}
	@PutMapping("/emplacement")
	public void modifierEmplacement(@RequestBody EmplacementStage e) {
		adminService.modifierEmplacement(e);
	}
	
	
	//Supprimer les entites:
	@DeleteMapping("/etudiant/{id}")
	public void supprimerEtudiant(@PathVariable long id) {
		adminService.deleteEtudiant(id);
	}
	@DeleteMapping("/encadrant/{id}")
	public void supprimerEncadrant(@PathVariable long id) {
		adminService.deleteEncadrant(id);
	}
	@DeleteMapping("/admin/{id}")
	public void supprimerAdmin(@PathVariable long id) {
		adminService.deleteAdministrateur(id);
	}
	@DeleteMapping("/stage/{id}")
	public void supprimeraStage(@PathVariable long id) {
		adminService.deleteStage(id);
	}
	@DeleteMapping("/annonce/{id}")
	public void supprimerAnnonce(@PathVariable long id) {
		adminService.deleteAnnonce(id);
	}
	@DeleteMapping("/emplacement/{id}")
	public void supprimerEmpacement(@PathVariable long id) {
		adminService.deleteEmplacement(id);
	}
	//Assigning entities:
	@GetMapping("/etudiant/assign/{idStudent}/{idNiveau}")
	public void assignStudent(@PathVariable long idStudent, @PathVariable long idNiveau) {
		adminService.assignLevelToStudent(idStudent, idNiveau);
	}
	@PostMapping("/encadrant/assign")
	public void assignTeacher(@RequestAttribute long idTeacher, @RequestAttribute long idNiveau) {
		adminService.assignLevelToTeacher(idTeacher, idNiveau);
	}
	@PostMapping("/stage/assign")
	public void assignStage(@RequestAttribute long idStage, @RequestAttribute long idNiveau) {
		adminService.assignLevelToStage(idStage, idNiveau);
	}
	//unassign entities:
	@PostMapping("/etudiant/unassign")
	public void unassignEtudiant(@RequestAttribute long idEtudiant) {
		adminService.removeLevelStudent(idEtudiant);
	}
	@PostMapping("/encadrant/unassign")
	public void unassignEncadrant(@RequestAttribute long idEncadrant) {
		adminService.removeLevelTeacher(idEncadrant);
	}
	@PostMapping("/niveau/unassign")
	public void unassignNiveau(@RequestAttribute long idNiveau,@RequestAttribute long idStage ) {
		adminService.removeLevelStage(idStage, idNiveau);
	}

}
