import { createContext, useState } from "react";

// create context
export const AuthContext=createContext();

// Provide context
export const AuthProvider=({children})=>{

   const [token,setToken]= useState(
        localStorage.getItem("token")
   )

    const login=(token)=>{
        localStorage.setItem("token",token);
        setToken(token)
    }

    const logout=()=>{}

    const isAuthenticated=null;


    return <AuthContext.Provider value={{login,logout,isAuthenticated}}>
              {children}
    </AuthContext.Provider>

}