<!DOCTYPE html>
<html lang="en">
<head>
    
    <title>SignUp</title>
    
    <style>

        body{
            background: linear-gradient(teal,gray,white);
            background-repeat: no-repeat;
            
        }
        
        section
        {
            width: 30%;
            margin: 50px auto;
            background-color: teal;
            border: 1px solid rgb(255, 255, 255);
            padding: 10px;
            border-radius: 5px;
            box-shadow: 3px 10px 10px rgb(130, 156, 156);
        }

        table td input{

            width: 100%;
            margin-left: 50px;
            margin-bottom:10px;
            height: 25px;
            padding: 5px;
            border:none;
            border-radius: 5px;
        }
        table td label
        {
            padding: 10px;
            color: white;
            padding: 5px;
        }
        table td button
        {
            margin-top: 20px;
            margin-left: 150px;
            height: 25px;
            border-radius: 5px;

        }
        table td button:hover{

            padding: 5px;
            box-shadow: 2px 2px 5px 2px rgb(165, 171, 172);
            
        }
        
        section h2{
       
       	text-align:center;
       	color: white;
       }

        section img{
            height: 100px;
            width: 100px;
            border-radius: 100%;
            margin: 0px 0 10px 150px;
            box-shadow: 5px 15px 20px rgb(205, 221, 221);
        }

        section:hover{
            box-shadow: 3px 4px 10px teal;
            border: 2px solid white;
        }


    </style>

</head>
<body>

    <marquee behavior="" direction="">Sign Up</marquee>

    <section>
	
    	<h2>Sign Up</h2>   

        <table>

           <form action="addUser" method="post">
           
           

            <tr>
                <td><label>Name</label></td>
                <td><input type="text" placeholder="Enter Name" name="name"></td>
            </tr>

            <tr>
                <td><label>Email-Id</label></td>
                <td><input type="email" placeholder="Enter Email ID" name="email"></td>
            </tr>

            <tr>
                <td><label>Password</label></td>
                <td><input type="password" placeholder="Enter password" name="password"></td>
            </tr>
            
            <tr>
                <td><label>Contact</label></td>
                <td><input type="number" placeholder="Enter Mobile No" name="contact"></td>
            </tr>
            
            <tr>
                <td><label>Country</label></td>
                <td><input type="text" placeholder="Enter Country" name="country"></td>
            </tr>

            <tr>
                <td colspan="2">
                    <button>SignUp</button>
                </td>
            </tr>

           </form>
        </table>

    </section>
    
</body>
</html>