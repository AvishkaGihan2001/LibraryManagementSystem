/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.library.dao.custom;

import edu.ijse.library.dao.SuperDAO;
import edu.ijse.library.entity.MemberEntity;
import java.util.ArrayList;

/**
 *
 * @author AVISHKA GIHAN
 */
public interface MemberDao extends SuperDAO {

    String save(MemberEntity memberEntity) throws Exception;

    String update(MemberEntity memberEntity) throws Exception;

    String delete(String ID) throws Exception;

    MemberEntity get(String ID) throws Exception;

    ArrayList<MemberEntity> getAll() throws Exception;

}
