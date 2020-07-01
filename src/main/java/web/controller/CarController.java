package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;
import java.util.Map;

@Controller
public class CarController {

    @Autowired
    private CarServiceImpl carService;

    @GetMapping("/cars")
    public String getCarsPage(@RequestParam Map<String, String> param, ModelMap model) {

        List<Car> list = carService.getAllCars();
        String locale = param.get("locale");
        if(locale.equals("en")) {
            model.addAttribute("title", "This is table of cars");
        } else {
            model.addAttribute("title", "Это таблица машин");
        }

        model.addAttribute("cars", list);
        return "car/cars";
    }

}
