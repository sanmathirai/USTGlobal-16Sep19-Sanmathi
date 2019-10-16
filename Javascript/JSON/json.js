const person = {
        name : 'Sundara',
        age  : 100,
        color : 'white',
        address : {
                    city : 'Bijapur',
                    state : 'Karnataka',
                    pincode : 591115
                  },
        hobbies : ['COding', 'Bird Watching' ,'Singing']

        }

    console.log('Javascript object ' ,person)
    const jsonObject = JSON.stringify(person)
    console.log('JSON object ' ,jsonObject)
    const javascriptObject = JSON.parse(jsonObject)
    console.log('Javascript object ' ,javascriptObject)
    localStorage.setItem('email','billgates@gmail.com')
    const emailId=localStorage.getItem('email')
    console.log('Email id', emailId)
    //localStorage.clear
    