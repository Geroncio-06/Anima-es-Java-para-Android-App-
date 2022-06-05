

-------------------------- ANIMATION ROLL POR YOYO LIB -------------------------------------------------------------------


1 - No Build Gradle (Module:app) implemente essas libs:


	implementation 'com.daimajia.androidanimations:library:2.4@aar'
    	


2 - Na Activity JAVA do objeto a ser animado:

	Button  btnsub 			// esse button só é o disparador da animação
	TextView textview; 		// objeto a ser animado


	------- em OnCreate:-----------------------------------------------------------------------------------------------------


	btnsub = findViewById(R.id.btnsub);
	textview = findViewById(R.id.texto);


	btnsub.setOnClickListener(new View.OnClickListener() {
            
	    @Override
            public void onClick(View param1view) { 						

                YoYo.with(Techniques.RollIn).duration(700).playOn(Main2Activity.this.textview); // ENTRAR ROLANDO PELA ESQUERDA
            }
        });


3 - Outras Animações Roll:

		YoYo.with(Techniques.RollOut).duration(700).playOn(Main2Activity.this.textview);     // SAIR ROLANDO PELA DIREITA


