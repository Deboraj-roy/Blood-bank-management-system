package com.controller;

import com.model.Blood;
import com.model.Client;
import com.service.ClientService;
import com.service.ManageBloodService;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
public class ClientHomeController {
    private final ManageBloodService manageBloodService;
    private final ClientService clientService;

    public ClientHomeController(ManageBloodService manageBloodService, ClientService clientService) {
        this.manageBloodService = manageBloodService;
        this.clientService = clientService;

    }
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);

    }


    @RequestMapping("/counter")
    public String bloodform(Model model, @RequestParam(required = false) String sortKey) {
        List<Blood> bloods = new ArrayList<>();
        bloods = manageBloodService.getAll();
        model.addAttribute("bloods", bloods);
        return "client-order";
    }

    @RequestMapping("/bloodsearch")
    public String delete(@RequestParam("searchforclient") String bloodGroup, Model model) {
        List<Blood> blood = manageBloodService.getAll(bloodGroup);
        model.addAttribute("blood", blood);
        return "client-order";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String medicineUpdateForm(@RequestParam("bloodId") int id, Model model) {

        Blood blood=manageBloodService.get(id);

        model.addAttribute("blood", blood);

        return "client-order";
    }




    @RequestMapping(value = "/createInfo", method = RequestMethod.GET)
    public String create(Model model) {
        Client client = new Client();
        model.addAttribute("client", client);
        return "create-client-info-form";
    }

    @RequestMapping(value = "/createInfo", method = RequestMethod.POST)
    public String createInfo(@Valid @ModelAttribute("client") Client client, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "create-client-info-form";
        }
        clientService.save(client);
        return "redirect:/api/two";
    }


    @RequestMapping("/showpersonal")
    public String personalInfoForm(Model model, @RequestParam(required = false) String sortKey) {
        List<Client> clients = new ArrayList<>();
        clients = clientService.getAll();
        model.addAttribute("clients", clients);
        return "personal-account-info";
    }

    @RequestMapping(value = "updatepersonal", method = RequestMethod.GET)
    public String personalInfoUpdateForm(@RequestParam("clientId") int clientId, Model model) {
        Client client= clientService.get(clientId);

        model.addAttribute("client", client);

        return "update-personal-info-form";
    }

    @RequestMapping(value = "/update personal", method = RequestMethod.POST)
    public String update(@ModelAttribute("client") Client client) {
        clientService.update(client);
        return "redirect:/api/personal";
    }


    @RequestMapping(value = "cart", method=RequestMethod.GET)
    public String cartForm(Model model) {
        return "cart";
    }
}
