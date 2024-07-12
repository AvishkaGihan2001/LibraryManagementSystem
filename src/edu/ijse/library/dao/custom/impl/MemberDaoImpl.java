/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.library.dao.custom.impl;

import edu.ijse.library.dao.CrudUtil;
import edu.ijse.library.dao.custom.MemberDao;
import edu.ijse.library.dto.MemberDto;
import edu.ijse.library.entity.MemberEntity;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public class MemberDaoImpl implements MemberDao {

    @Override
    public String save(MemberEntity memberEntity) throws Exception {
        boolean isSaved = CrudUtil.executeUpdate("INSERT INTO member VALUES(?,?,?,?,?,?)",
                0,
                memberEntity.getCode(),
                memberEntity.getFirstName(),
                memberEntity.getLastName(),
                memberEntity.getPhone(),
                memberEntity.getAddress()
        );
        return isSaved ? "Success" : "Fail";
    }

    @Override
    public String update(MemberEntity memberEntity) throws Exception {
        boolean isUpdated = CrudUtil.executeUpdate("UPDATE member SET firstName = ?, lastName = ?, phone = ?, address = ? WHERE code = ?",
                memberEntity.getFirstName(),
                memberEntity.getLastName(),
                memberEntity.getPhone(),
                memberEntity.getAddress(),
                memberEntity.getCode()
        );
        return isUpdated ? "Success" : "Fail";
    }

    @Override
    public String delete(String code) throws Exception {
        boolean isDeleted = CrudUtil.executeUpdate("DELETE FROM member WHERE code = ?", code);
        return isDeleted ? "Success" : "Fail";
    }

    @Override
    public MemberDto get(String code) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM member WHERE code = ?", code);
        if (rst.next()) {
            MemberDto memberDto = new MemberDto(
                    rst.getString("code"),
                    rst.getString("firstName"),
                    rst.getString("lastName"),
                    rst.getString("phone"),
                    rst.getString("address")
            );
            return memberDto;
        }
        return null;
    }

    @Override
    public ArrayList<MemberEntity> getAll() throws Exception {
        ResultSet resultSet = CrudUtil.executeQuery("SELECT * FROM member");
        ArrayList<MemberEntity> memberList = new ArrayList<>();
        while (resultSet.next()) {
            memberList.add(new MemberEntity(
                    resultSet.getString("code"),
                    resultSet.getString("firstName"),
                    resultSet.getString("lastName"),
                    resultSet.getString("phone"),
                    resultSet.getString("address")
            ));
        }
        return memberList;
    }

}
