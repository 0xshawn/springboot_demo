package com.wayknew.demo.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserBO {
    // BO means Bossiness Object

    @Resource
    UserDAO userDAO;
    private User user;

    /**
     * Create user via name, phone and gender
     * @param name
     * @param phone
     * @param gender
     * @return
     */
    User create(String name, String phone, Byte gender) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setGender(gender);

        return userDAO.save(user);
    }

    /**
     * Get user by id
     * @param userId
     * @return
     */
    User getById(Long userId) {

        return userDAO.getOne(userId);
    }
       void delete(Long Id){
        userDAO.deleteById(Id);

        }


    User deleteuser(Long userID){

       if(userID!=null) {
          userDAO.deleteById(userID);
        }else{
            System.out.println("此数据不存在");
       }
        return userDAO.save(user);
          }




/*    User updateuser(){
        return userDAO.

    }*/


/*
    User update(String name, String phone, Byte gender) {
        User user = new User();
        user.getId();
        user.setName(name);
        user.setPhone(phone);
        user.setGender(gender);
        return userDAO.save(user);
    }
*/

  /*  User delete(Long userId){
       return userDAO.deleteUserBy(Long userId);

    }*/
  /*  User update(String name, String phone, Byte gender) {
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setGender(gender);

        return userDAO.save(user);
    }
*/


/*    @Modifying
    @Query(value = "delete from user where id = ?1", nativeQuery = true)
    public void deleteQuery(Integer id) {

    }*/


}




