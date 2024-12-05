package com.example.demo.Controller;

import com.example.demo.Entity.LopHoc;
import com.example.demo.Entity.SinhVien;
import com.example.demo.Repository.LopHocRepository;
import com.example.demo.Repository.SinhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienConTroller {
    @Autowired
    SinhVienRepository sinhVienRepository;
    @Autowired
    LopHocRepository lopHocRepository;
    @GetMapping("hien-thi")
    public String getALL(Model model){
        model.addAttribute("list",sinhVienRepository.findAll());
        return "hien-thi";
    }
    @ModelAttribute("lopHoc")
    List<LopHoc> lophoc(){
        return lopHocRepository.findAll();
    }
    @PostMapping("/add")
    public String them(SinhVien sinhVien){
        sinhVienRepository.save(sinhVien);
        return "redirect:/sinhvien/hien-thi";
    }
    @GetMapping("/xoa")
    public String xoa(Integer id){
        sinhVienRepository.deleteById(id);
        return "redirect:/sinhvien/hien-thi";
    }
    @GetMapping("/chitiet")
    public String chitiet(Model model,Integer id){
        model.addAttribute("up",sinhVienRepository.findById(id).get());
        return "chi-tiet";
    }

}
