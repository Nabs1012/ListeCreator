<!doctype html>
<html lang="en">

<!-- Required meta tags -->
<!-- <meta charset="utf-8"> -->
<!-- <meta name="viewport" -->
<!-- 	content="width=device-width, initial-scale=1, shrink-to-fit=no"> -->

<!-- <!-- Bootstrap CSS --> 
<!-- <link rel="stylesheet" -->
<!-- 	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" -->
<!-- 	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" -->
<!-- 	crossorigin="anonymous"> -->
<jsp:include page="header.jsp"></jsp:include>


<body>

	<div class="container">
		<form method="post" >
			<div
				class="form-group" > <label for="titre">Titre:</label> <input
					class="form-control " type="text" id="titre" placeholder="Titre"
					required="true" name="titre">
			</div>
			<div
				class="form-group" > <label for="prio">Priorité:</label> <input
					class="form-control " type="text" id="prio" placeholder="priorité"
					required="true" name="priorite">
			</div>
			
			<div class="form-group">
       		 <label for="tache">Tache:</label>
        <textarea  class="form-control" type="text" id="tache" placeholder="à faire" required="true" name=tache></textarea>
      </div>
     

      <Button>Valider</Button>


    </form>
  </div>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
<!--     <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script> -->
<!--     <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script> -->
<!--     <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> -->
  </body>
</html>
