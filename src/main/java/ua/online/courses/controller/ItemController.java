package ua.online.courses.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {

	@GetMapping("/all-items")
	public String shoeItems(Model model) {
		List<String> items = new ArrayList<>();
		items.add("Item-1");
		items.add("Item-2");
		items.add("Item-3");
		items.add("Item-4");
		items.add("Item-5");
		items.add("Item-6");
		items.add("Item-7");
		items.add("Item-8");
		items.add("Item-9");
		
		model.addAttribute("items", items);
		return "items/all-items";
	}
	
	@GetMapping("/all-items/{oneItem}")
	public String showItem(Model model, @PathVariable("oneItem") String oneItem) {
		
		model.addAttribute("oneItem", oneItem);
		return "items/item";
	}
	
	
}
