/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.service.custom;

import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface MemberService extends SuperService {

    public String save(MemberDto memberDto) throws Exception;

    public String update(MemberDto memberDto) throws Exception;

    public String delete(String code) throws Exception;

    public MemberDto get(String code) throws Exception;

    public ArrayList<MemberDto> getAll() throws Exception;

}
