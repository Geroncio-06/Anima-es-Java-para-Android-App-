

-------------------------- ANIMATION SHAKE POR YOYO LIB ----------------------------


1 - No Build Gradle (Module:app) implemente essas libs:


	implementation 'com.daimajia.easing:library:2.0@aar'
    	implementation 'com.daimajia.androidanimations:library:2.3@aar'


2 - Na Activity JAVA do objeto a ser animado:

	Button  btnsub 			// esse button só é o disparador da animação
	TextView textview; 		// objeto a ser animado


	------- em OnCreate:---------------


	btnsub = findViewById(R.id.btnsub);
	textview = findViewById(R.id.texto);


	btnsub.setOnClickListener(new View.OnClickListener() {
            
	    @Override
            public void onClick(View param1view) { 					       // TREMER

                YoYo.with(Techniques.Shake).duration(700).playOn(Main2Activity.this.textview); // animação propriamente 

            }
        });