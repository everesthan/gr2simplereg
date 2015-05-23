/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr2simplereg.bean;



import tr.gov.ptt.gr2simplereg.entity.User;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/**
 *
 * @author Administrator
 */


@ManagedBean

@RequestScoped

public class RegisterBean {
    private User user;
   
    public RegisterBean() {
        this.user = new User();
                
    }
   

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
   public String register(){
       System.out.println("User registered:" +user);
       String msg = "User registered successfully";
       FacesContext.getCurrentInstance().
               addMessage(msg, new FacesMessage(FacesMessage.SEVERITY_INFO, msg, msg));
       FacesContext.getCurrentInstance().getExternalContext()
               .getFlash().setKeepMessages(true);
   return "register1.xhtml?faces-redirect=true";    
   } 
    
}
