$(".login100-form-btn").on("click", function(e) {
    e.preventDefault(); // Empêcher la page de se recharger
    var adresse = $("#adresse").val(); // Nous récupérons le contenu du champ adresse
    if(adresse != ""){ // Si l'adresse n'est pas vide
        var geocoder =  new google.maps.Geocoder(); // On instancie le geocoder
        geocoder.geocode( { 'address': adresse}, function(results, status) {
            if (status == google.maps.GeocoderStatus.OK) { // Si l'adresse a été résolue
                lat = results[0].geometry.location.lat(); // On récupère la latitude
                lon = results[0].geometry.location.lng(); // On récupère la longitude
            } else {
                alert("Something got wrong " + status);
            }
        });
    }
});

var address ='1600 Amphitheatre Parkway Mountain View, CA'
	$.geo.geocode(address, {
	    success:function(data) {
	      console.log(data);
	    },
	    error:function() {
	      // error callback
	    }
	});
