

---------------------------- ANIMATION FADE POR YOYO LIB ----------------------------------------------------------------------


1 - No Build Gradle (Module:app) implemente essas libs:


	
    	implementation 'com.daimajia.androidanimations:library:2.4@aar'


2 - Na Activity JAVA do objeto a ser animado:

	Button  btnsub 			// esse button só é o disparador da animação
	TextView textview; 		// objeto a ser animado


	------- em OnCreate:---------------------------------------------------------------------------------------------------------


	btnsub = findViewById(R.id.btnsub);
	textview = findViewById(R.id.texto);


	btnsub.setOnClickListener(new View.OnClickListener() {
            
	    @Override
            public void onClick(View param1view) { 						// APARECER GRADUALMENTE

                YoYo.with(Techniques.FadeIn).duration(700).playOn(Main2Activity.this.textview); // animação propriamente 

            }
        });


3 - Outras Animações FADE:

		YoYo.with(Techniques.FadeInDown).duration(700).playOn(Main2Activity.this.textview);     // APARECER GRADUALMENTE POR BAIXO

		YoYo.with(Techniques.FadeInUp).duration(700).playOn(Main2Activity.this.textview); 	// APARECER GRADUALMENTE POR CIMA

		YoYo.with(Techniques.FadeInLeft).duration(700).playOn(Main2Activity.this.textview);   	// APARECER GRADUALMENTE PELA ESQUERDA

		YoYo.with(Techniques.FadeInRight).duration(700).playOn(Main2Activity.this.textview);    // APARECER GRADUALMENTE PELA DIREITA


		YoYo.with(Techniques.FadeOut).duration(700).playOn(Main2Activity.this.textview);   	// DESAPARECER GRADUALMENTE

		YoYo.with(Techniques.FadeOutDown).duration(700).playOn(Main2Activity.this.textview);    // DESAPARECER GRADUALMENTE POR BAIXO

		YoYo.with(Techniques.FadeOutUp).duration(700).playOn(Main2Activity.this.textview); 	// DESAPARECER GRADUALMENTE POR CIMA

		YoYo.with(Techniques.FadeOutLeft).duration(700).playOn(Main2Activity.this.textview);   	// DESAPARECER GRADUALMENTE PELA ESQUERDA

		YoYo.with(Techniques.FadeOutRight).duration(700).playOn(Main2Activity.this.textview);   // DESAPARECER GRADUALMENTE PELA DIREITA



