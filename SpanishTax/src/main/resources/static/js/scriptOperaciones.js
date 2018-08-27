	function total(){
			var box3 = Number(document.getElementById('box3').value);
			var box6 = Number(document.getElementById('box6').value);
			var box9 = Number(document.getElementById('box9').value);
			var box11 = Number(document.getElementById('box11').value);
			var box13 = Number(document.getElementById('box13').value);
			var box15 = Number(document.getElementById('box15').value);
			var box18 = Number(document.getElementById('box18').value);
			var box21 = Number(document.getElementById('box21').value);
			var box24 = Number(document.getElementById('box24').value);
			var box26 = Number(document.getElementById('box26').value);

			var total = box3+box6+box9+box11+box13+box15+box18+box21+box24+box26;
			document.getElementById('totalCasillas1').value=total;
			document.getElementById('totalAccured').value=total;
		}

		function total2(){
			var box29 = Number(document.getElementById('box29').value);
			var box31 = Number(document.getElementById('box31').value);
			var box33 = Number(document.getElementById('box33').value);
			var box35 = Number(document.getElementById('box35').value);
			var box37 = Number(document.getElementById('box37').value);
			var box39 = Number(document.getElementById('box39').value);
			var box41 = Number(document.getElementById('box41').value);
			var box42 = Number(document.getElementById('box42').value);
			var box43 = Number(document.getElementById('box43').value);
			var box44 = Number(document.getElementById('box44').value);

			var total = box29+box31+box33+box35+box37+box39+box41+box42+box43+box44;
			document.getElementById('totalCasillas2').value=total;
			document.getElementById('totalDeduction').value=total;
		}

		function totalAll(){
			var total1 = Number(document.getElementById('totalCasillas1').value);
			var total2 = Number(document.getElementById('totalCasillas2').value);

			var totalAll = total1+total2;
			document.getElementById('totalAll').value=totalAll;
			document.getElementById('totalTax').value=totalAll;
		}

		function clearAll(){
			var box1 = document.getElementById('box1');
			box1.value = ''
			var box2 = document.getElementById('box2');
			box2.value = ''
			var box3 = document.getElementById('box3');
			box3.value = ''

			var box4 = document.getElementById('box4');
			box4.value = ''
			var box5 = document.getElementById('box5');
			box5.value = ''
			var box6 = document.getElementById('box6');
			box6.value = ''

			var box7 = document.getElementById('box7');
			box7.value = ''
			var box8 = document.getElementById('box8');
			box8.value = ''
			var box9 = document.getElementById('box9');
			box9.value = ''

			var box10 = document.getElementById('box10');
			box10.value = ''
			var box11 = document.getElementById('box11');
			box11.value = ''

			var box12 = document.getElementById('box12');
			box12.value = ''
			var box13 = document.getElementById('box13');
			box13.value = ''

			var box14 = document.getElementById('box14');
			box14.value = ''
			var box15 = document.getElementById('box15');
			box15.value = ''

			var box16 = document.getElementById('box16');
			box16.value = ''
			var box17 = document.getElementById('box17');
			box17.value = ''
			var box18 = document.getElementById('box18');
			box18.value = ''

			var box19 = document.getElementById('box19');
			box19.value = ''
			var box20 = document.getElementById('box20');
			box20.value = ''
			var box21 = document.getElementById('box21');
			box21.value = ''

			var box22 = document.getElementById('box22');
			box22.value = ''
			var box23 = document.getElementById('box23');
			box23.value = ''
			var box24 = document.getElementById('box24');
			box24.value = ''

			var box25 = document.getElementById('box25');
			box25.value = ''
			var box26 = document.getElementById('box26');
			box26.value = ''

			var box27 = document.getElementById('totalCasillas1');
			box27.value = ''

			var box28 = document.getElementById('box28');
			box28.value = ''
			var box29 = document.getElementById('box29');
			box29.value = ''

			var box30 = document.getElementById('box30');
			box30.value = ''
			var box31 = document.getElementById('box31');
			box31.value = ''

			var box32 = document.getElementById('box32');
			box32.value = ''
			var box33 = document.getElementById('box33');
			box33.value = ''

			var box34 = document.getElementById('box34');
			box34.value = ''
			var box35 = document.getElementById('box35');
			box35.value = ''

			var box36 = document.getElementById('box36');
			box36.value = ''
			var box37 = document.getElementById('box37');
			box37.value = ''

			var box38 = document.getElementById('box38');
			box38.value = ''
			var box39 = document.getElementById('box39');
			box39.value = ''

			var box40 = document.getElementById('box40');
			box40.value = ''
			var box41 = document.getElementById('box41');
			box41.value = ''

			var box42 = document.getElementById('box42');
			box42.value = ''

			var box43 = document.getElementById('box43');
			box43.value = ''

			var box44 = document.getElementById('box44');
			box44.value = ''

			var box45 = document.getElementById('totalCasillas2');
			box45.value = ''

			var box46 = document.getElementById('totalAll');
			box46.value = ''
		}
		
		function ckBox1(obj){
			if(obj.checked){			
			 var cbs1 = document.getElementsByClassName("cb1");
			    for (var i = 0; i < cbs1.length; i++) {
			        cbs1[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox2(obj){
			if(obj.checked){			
			 var cbs2 = document.getElementsByClassName("cb2");
			    for (var i = 0; i < cbs2.length; i++) {
			        cbs2[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox3(obj){
			if(obj.checked){			
			 var cbs3 = document.getElementsByClassName("cb3");
			    for (var i = 0; i < cbs3.length; i++) {
			        cbs3[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox4(obj){
			if(obj.checked){			
			 var cbs4 = document.getElementsByClassName("cb4");
			    for (var i = 0; i < cbs4.length; i++) {
			        cbs4[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox5(obj){
			if(obj.checked){			
			 var cbs5 = document.getElementsByClassName("cb5");
			    for (var i = 0; i < cbs5.length; i++) {
			        cbs5[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox6(obj){
			if(obj.checked){			
			 var cbs6 = document.getElementsByClassName("cb6");
			    for (var i = 0; i < cbs6.length; i++) {
			        cbs6[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox7(obj){
			if(obj.checked){			
			 var cbs7 = document.getElementsByClassName("cb7");
			    for (var i = 0; i < cbs7.length; i++) {
			        cbs7[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox8(obj){
			if(obj.checked){			
			 var cbs8 = document.getElementsByClassName("cb8");
			    for (var i = 0; i < cbs8.length; i++) {
			        cbs8[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox9(obj){
			if(obj.checked){			
			 var cbs9 = document.getElementsByClassName("cb9");
			    for (var i = 0; i < cbs9.length; i++) {
			        cbs9[i].checked = false;
			    }
			    obj.checked = true;
			}
		}
		
		function ckBox11(obj){
			if(obj.checked){			
			 var cbs11 = document.getElementsByClassName("cb11");
			    for (var i = 0; i < cbs11.length; i++) {
			        cbs11[i].checked = false;
			    }
			    obj.checked = true;
			}
		}