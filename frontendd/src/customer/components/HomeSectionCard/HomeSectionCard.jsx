import React from 'react'

const HomeSectionCard = () => {
  return (
    <div className='cursor-pointer flex flex-col items-center bg-white rounded-lg shadw-lg shadow-hidden w-[15rem] mx-3'>

        <div className='h-[13rem] w-[10rem] '>
            <img className='object-cover object-top w-full h-full'
             src="https://5.imimg.com/data5/SELLER/Default/2022/9/UH/NJ/EN/25396958/latest-kurta-designs-for-men-indian-kurta-looks-better-than-a-thousand-business-suits--1000x1000.jpeg"
              alt="" />
        </div>
        <div className='p-4'>
            <h3 className='text-lg font-medium text-gray-900'>NoFilter</h3>
            <p className='mt-2 text-sm text-gray-500'>Mens pure solid white kurta</p>

        </div>

    </div>
  )
}

export default HomeSectionCard