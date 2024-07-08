/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.service.custom.impl;

import edu.ijse.library.dao.DaoFactory;
import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.entity.MemberEntity;
import edu.ijse.library.service.custom.MemberService;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class MemberServiceImpl implements MemberService {

    private MemberDao memberDao = (MemberDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.MEMBER);

    @Override
    public String save(MemberDto memberDto) throws Exception {
        MemberEntity memberEntity = new MemberEntity(
                memberDto.getCode(),
                memberDto.getFirstName(),
                memberDto.getLastName(),
                memberDto.getPhone(),
                memberDto.getAddress()
        );
        return memberDao.save(memberEntity);

    }

    @Override
    public String update(MemberDto memberDto) throws Exception {
        MemberEntity memberEntity = new MemberEntity(
                memberDto.getCode(),
                memberDto.getFirstName(),
                memberDto.getLastName(),
                memberDto.getPhone(),
                memberDto.getAddress()
        );
        return memberDao.update(memberEntity);
    }

    @Override
    public String delete(String code) throws Exception {
       return memberDao.delete(code);
    }

    @Override
    public MemberDto get(String code) throws Exception {
       return memberDao.get(code);
    }

    @Override
    public ArrayList<MemberDto> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
