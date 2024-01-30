<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
</head>
<body>
<body style="background-color:#fff; background-image: url('all_component/images/bnr8.jpg'); background-repeat: no-repeat; background-size: cover;">
<%@ include file="all_component/navbar.jsp"%>
      
      
      <div class="container">
         <div class="row">
            <div class="col-sm-12">
               <img src="all_component/images/logo.png"  class="center" >
            </div>
         </div>
      </div>
      <div class="container title">
         <img src="all_component/images/cbse_name.png" class="title">
      </div>

         <div class="container customContainer">
            <div class="mainWebTab hoverContainerBlk" style="margin-bottom: 15px;">               
              <a id="gvlist_lnkbtnOnline_0" title="Main Website" class="btn-grad" href="studentsdetails.jsp" target="_blank"><b> <!-- <br>मुख्य वेबसाइट <br> --><br>STUDENTS DETAILS <br><br></b>
            
               </a>
               <a id="gvlist_lnkbtnOnline_0" title="A Comprehensive One Stop Portal for All Exam Activities" class="btn-grad" href="studentreg.jsp"><b> <!-- <br>विद्यार्थी<br> --><br>STUDENTS<br><br></b></a>
               <a id="gvlist_lnkbtnOnline_0" title="Result"class="btn-grad" href="#" ><b><!-- <br>परिणाम एवं प्रमाणपत्र<br> --><br>RESULT & CERTIFICATE<br><br></b></a> 
            </div>
            <div class="mainWebTab">
                  <a id="gvlist_lnkbtnOnline_0" title="A Comprehensive One Stop Portal for All Affiliation Activities" class="btn-grad" href="addMarks.jsp"><b> <!-- <br>अंक जोड़ें<br> --><br>ADD MARKS<br><br> </b></a>
                  <a id="gvlist_lnkbtnOnline_0" title="Academic Website" class="btn-grad"  href="#" ><b><!-- <br>प्रतिशत एवं कोटियन<br> --><br>PERCENTAGE & GRADE<br><br></b></a>
               <a id="gvlist_lnkbtnOnline_0" title="A Comprehensive One Stop Portal for Training Activities" class="btn-grad"  href="#"><b><!-- <br>सूचना एवं अद्यतन<br --><br>NOTICE & UPDATE<br><br></b></a>  
             </div>
         </div>
      
      <div class="container">
        <div class="text-center" style="min-height: 150px">
                  
                  <div class="clock">
                     <div class="clock__hand clock__hand--h" aria-hidden="true" data-unit>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                     </div>
                     <div class="clock__hand clock__hand--m" style="color:#114199;" aria-hidden="true" data-unit>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <!-- <div class="clock__number">00</div> -->
                     </div>
                     <div class="clock__hand clock__hand--s" style="color:rgb(131, 131, 131);" aria-hidden="true" data-unit>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <div class="clock__number">00</div>
                        <!-- <div class="clock__number">00</div> -->
                     </div>
                     <div class="clock__hand clock__hand--ap" style="color:red;" aria-hidden="true" data-unit>
                        <div class="clock__number">AM</div>
                     </div>
                  </div>
         </div>
      </div>

      <!-- Foooterrr -->
      <%@ include file="all_component/footer.jsp"%>
   <script>
      window.addEventListener("DOMContentLoaded", () => {
    		new Clock31(".clock");
    	});

    	class Clock31 {
    		constructor(el) {
    			this.el = document.querySelector(el);

    			this.init();
    		}
    		init() {
    			this.timeUpdate();
    		}
    		get timeAsObject() {
    			const date = new Date();
    			const h = date.getHours();
    			const m = date.getMinutes();
    			const s = date.getSeconds();

    			return { h, m, s };
    		}
    		get timeAsString() {
    			const [h, m, s, ap] = this.timeDigits;
    			const time = `${h}:${m}:${s} ${ap}`;

    			return `${time}`.trim();
    		}
    		get timeDigits() {
    			let { h, m, s } = this.timeAsObject;

    			const ap = h > 11 ? "PM" : "AM";
    			if (h > 12) h -= 12;

    			const hh = `${h}`;
    			const mm = m < 10 ? `0${m}` : `${m}`;
    			const ss = s < 10 ? `0${s}` : `${s}`;

    			return [hh, mm, ss, ap];
    		}
    		animateSecondHand() {
    			const time = this.timeAsObject;
    			const minFraction = time.s / 60;
    			const angleB = Utils.decPlaces(360 * minFraction, 3);
    			const angleA = angleB - 6;
    			const duration = 300;
    			const easing = "cubic-bezier(0.65,0,0.35,1)";
    			const handEl = this.el?.querySelectorAll("[data-unit]")[2];
    			// hand itself
    			handEl?.animate(
    				[
    					{ transform: `rotate(${angleA}deg)` },
    					{ transform: `rotate(${angleB}deg)` }
    				],
    				{ duration, easing }
    			);
    			// numbers inside
    			const numbers = handEl.children;
    			for (let n = 0; n < numbers.length; ++n) {
    				const transY = -100 * (n + 1);
    				numbers[n].animate(
    					[
    						{ transform: `translateY(${transY}%) rotate(${-angleA}deg)` },
    						{ transform: `translateY(${transY}%) rotate(${-angleB}deg)` }
    					],
    					{ duration, easing }
    				);
    			}
    		}
    		timeUpdate() {
    			// update the accessible timestamp in the `title`
    			this.el?.setAttribute("title", this.timeAsString);
    			// move the hands
    			const time = this.timeAsObject;
    			const minFraction = time.s / 60;
    			const hrFraction = (time.m + minFraction) / 60;
    			const twelveHrFraction = (time.h % 12 + hrFraction) / 12;
    			const angles = [
    				{
    					prop: "--secAngle",
    					value: Utils.decPlaces(360 * minFraction, 3)
    				},
    				{
    					prop: "--minAngle",
    					value: Utils.decPlaces(360 * hrFraction, 3)
    				},
    				{
    					prop: "--hrAngle",
    					value: Utils.decPlaces(360 * twelveHrFraction, 3)
    				}
    			];
    			for (let a of angles) {
    				this.el?.style.setProperty(a.prop, `${a.value}deg`);
    			}
    			// draw the hands using the corresponding digits
    			const digits = this.timeDigits;
    			for (let d = 0; d < digits.length; ++d) {
    				const unitEl = this.el?.querySelectorAll("[data-unit]")[d];
    				if (unitEl) {
    					const numbers = unitEl.children;
    					for (let n = 0; n < numbers.length; ++n) {
    						numbers[n].textContent = digits[d];
    					}
    				}
    			}
    			this.animateSecondHand();
    			// loop
    			clearTimeout(this.timeUpdateLoop);
    			this.timeUpdateLoop = setTimeout(this.timeUpdate.bind(this), 1e3);
    		}
    	}
    	class Utils {
    		static decPlaces(n, d) {
    			return Math.round(n * 10 ** d) / 10 ** d;
    		}
    	}
      </script>
  </body>
</body>
</html>