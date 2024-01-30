$("button").click(function() {
  $(this)
    .parent()
    .toggleClass("open");
});
$(".dropdown-multi-select .dropdown-multi-select-item").click(function() {
  $(this).toggleClass("active");
});

$(function() {
        $('#datepicker').datepicker();
    });
    
    
    
 //--------------------------------------------------------------------------------------------------------------   
document.getElementById('myInput').addEventListener('input', function() {
  var input = this.value.toLowerCase(); // Convert input to lowercase for case-insensitive matching
  var datalist = document.getElementById('suggestions');
  var options = datalist.getElementsByTagName('option');

  // Hide or show options based on user input
  for (var i = 0; i < options.length; i++) {
    var optionValue = options[i].value.toLowerCase();
    if (optionValue.indexOf(input) !== -1) {
      options[i].removeAttribute('hidden');
    } else {
      options[i].setAttribute('hidden', 'true');
    }
  }
});



//---------------------------------------------------------------------------------------------------------------
function showSuccessMessage() {
  // Show the success message
  document.getElementById('successMessage').style.display = 'block';

  // Hide the success message after 5 seconds
  setTimeout(function() {
    document.getElementById('successMessage').style.display = 'none';
  }, 5000); // 5000 milliseconds = 5 seconds
}