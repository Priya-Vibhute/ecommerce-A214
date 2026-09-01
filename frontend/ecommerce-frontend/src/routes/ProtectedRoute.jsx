import React, { useContext } from 'react'
import { AuthContext } from '../context/AuthContext'
import { Navigate } from 'react-router-dom'

function ProtectedRoute() {

  const {isAuthenticated}=useContext(AuthContext)

  if(!isAuthenticated)
    return <Navigate to={"/login"}/>


  return 
}

export default ProtectedRoute