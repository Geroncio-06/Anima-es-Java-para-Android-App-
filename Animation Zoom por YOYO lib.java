

-------------------------- ANIMATION ZOOM POR YOYO LIB ---------------------------------------------------------------------


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
            public void onClick(View param1view) { 						     // ENTRAR COM ZOOM

                YoYo.with(Techniques.ZoomIn).duration(700).playOn(Main2Activity.this.textview);      // animação propriamente 

            }
        });


3 - Outras Animações Zoom:


		YoYo.with(Techniques.ZoomInDown).duration(700).playOn(Main2Activity.this.textview);           // ENTRAR COM ZOOM POR BAIXO

		YoYo.with(Techniques.ZoomInUp).duration(700).playOn(Main2Activity.this.textview);             // ENTRAR COM ZOOM POR CIMA

		YoYo.with(Techniques.ZoomInLeft).duration(700).playOn(Main2Activity.this.textview);           // ENTRAR COM ZOOM PELA ESQUERDA

		YoYo.with(Techniques.ZoomInRight).duration(700).playOn(Main2Activity.this.textview);          // ENTRAR COM ZOOM PELA DIREITA





		YoYo.with(Techniques.ZoomOut).duration(700).playOn(Main2Activity.this.textview);              // SAIR COM ZOOM  

		YoYo.with(Techniques.ZoomOutDown).duration(700).playOn(Main2Activity.this.textview);          // SAIR COM ZOOM POR BAIXO

		YoYo.with(Techniques.ZoomOutUp).duration(700).playOn(Main2Activity.this.textview);            // SAIR COM ZOOM POR CIMA

		YoYo.with(Techniques.ZoomOutLeft).duration(700).playOn(Main2Activity.this.textview);          // SAIR COM ZOOM PELA ESQUERDA

		YoYo.with(Techniques.ZoomOutRight).duration(700).playOn(Main2Activity.this.textview);         // SAIR COM ZOOM PELA DIREITA



		

