package orgusermanagementapp.Springcore.Prac.interfaceservice;


import java.util.List;

import orgusermanagementapp.Springcore.Prac.usermanagementmodel.Usermanagemet;

public interface Iservice {
   Usermanagemet getUser(Integer userId);
   String createUser(Usermanagemet create);
   String UpdateUser(Usermanagemet update);
   String UpdateDateOfBirth(Usermanagemet updatebirth);
   String deleteUserId(Integer userId);
   List<Usermanagemet> getfirstNameAndCompany(String firstName, String company);
   List<Usermanagemet> getAllUser(Usermanagemet getUser);
    
}
