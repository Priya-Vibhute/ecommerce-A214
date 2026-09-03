import React, { useEffect, useState } from 'react'
import api from '../../../api'

function Products() {

  const [products, setProducts] = useState(null)

  const fetchProducts = async () => {
    try {

      const response = await api.get("/products");
      setProducts(response.data.content)

    } catch (error) {
      alert("Something went wrong")
    }
  }


  useEffect(() => {
    fetchProducts()
  }, [])


  return (
    <div>
        {products && products.map(p=><p>{p.name}</p>)}
    </div>
  )
}

export default Products