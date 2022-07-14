package com.example.produit.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.produit.model.Produit;  
import com.example.produit.service.ProduitService;

@Controller
public class ProduitController {
	
	
	@Autowired
	private ProduitService produitService;
	
	@PostMapping("/save")
	//public Produit saveProduit(@RequestBody Produit produit) {
	//pour save un produit
		public String saveProduit(@ModelAttribute("produit") Produit produit) {
		produitService.saveproduit(produit);
		 return "redirect:/";
		//return produitService.saveproduit(produit);
	}
	
	@GetMapping("/showNewEmployeeForm")
    public String showNewProduitForm(Model model) {
        // create model attribute to bind form data
        Produit produit = new Produit();
        model.addAttribute("produit", produit);
        return "new_produit";
    }

	@GetMapping("/showFormForUpdate/{id}")
	//public List<Produit> getAllproduit(){
		//return produitService.getAllProduit();
	//}
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Produit produit = produitService.getProduitById(id);
		model.addAttribute("produit", produit);
        return "update_produit";
	}
	@GetMapping("/deleteProduit/{id}")
    public String deleteProduit(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.produitService.deleteProduitById(id);
        return "redirect:/";
    }
	
	
	@GetMapping("/")
	public String index(Model model ) {
		model.addAttribute("listProduits", produitService.getAllProduit());
		
		return "index";
	}
	

}
