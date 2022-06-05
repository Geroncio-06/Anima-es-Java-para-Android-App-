

-------------------------- ANIMATION TAKINGOFF POR YOYO LIB -------------------------------------------------------------


1 - No Build Gradle (Module:app) implemente essas libs:


	implementation 'com.daimajia.androidanimations:library:2.4@aar'



2 - Na Activity JAVA do objeto a ser animado:

	Button  btnsub 			// esse button só é o disparador da animação
	TextView textview; 		// objeto a ser animado


	------- em OnCreate:----------------------------------------------------------------------------------------------------


	btnsub = findViewById(R.id.btnsub);
	textview = findViewById(R.id.texto);


	/*
	ANIMAÇÃO DECOLAR*/


	btnsub.setOnClickListener(new View.OnClickListener() {
            
	    @Override
            public void onClick(View param1view) { 						   

                YoYo.with(Techniques.TakingOff).duration(700).playOn(Main2Activity.this.textview); // animação propriamente 

            }
        });