/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.controller;

import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.service.ServiceFactory;
import edu.ijse.library.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class MemberController {

    private MemberService memberService = (MemberService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.MEMBER);

    public String save(MemberDto memberDto) throws Exception {
        return memberService.save(memberDto);
    }

    public String update(MemberDto memberDto) throws Exception {
        return memberService.update(memberDto);
    }

    public String delete(String code) throws Exception {
        return memberService.delete(code);
    }

    public MemberDto get(String code) throws Exception {
        return memberService.get(code);
    }

    public ArrayList<MemberDto> getAll() throws Exception {
        return memberService.getAll();
    }
}
