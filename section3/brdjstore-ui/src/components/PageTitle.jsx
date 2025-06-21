import React from 'react'
import { Children } from 'react'

export default function PageTitle({title, children}) {
    return (
    <h1 className='page-title'>{title}</h1>
  ) 
}
