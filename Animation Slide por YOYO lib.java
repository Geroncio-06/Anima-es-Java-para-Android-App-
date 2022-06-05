

-------------------------- ANIMATION SLIDE POR YOYO LIB ------------------------------------------------------------------


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
                YoYo.with(Techniques.SlideInDown).duration(700).playOn(Main2Activity.this.textview); // ENTRAR SLIDE POR BAIXO 


            }
        });


3 - Outras Animações Slide:

		YoYo.with(Techniques.SlideInUp).duration(700).playOn(Main2Activity.this.textview);            // ENTRAR SLIDE POR CIMA

		YoYo.with(Techniques.SlideInLeft).duration(700).playOn(Main2Activity.this.textview);          // ENTRAR SLIDE PELA ESQUERDA

		YoYo.with(Techniques.SlideInRight).duration(700).playOn(Main2Activity.this.textview);         // ENTRAR SLIDE PELA DIREITA




		YoYo.with(Techniques.SlideOutDown).duration(700).playOn(Main2Activity.this.textview);         // SAIR SLIDE POR BAIXO 

		YoYo.with(Techniques.SlideOutUp).duration(700).playOn(Main2Activity.this.textview);           // SAIR SLIDE POR CIMA

		YoYo.with(Techniques.SlideOutLeft).duration(700).playOn(Main2Activity.this.textview);         // SAIR SLIDE PELA ESQUERDA

		YoYo.with(Techniques.SlideOutRight).duration(700).playOn(Main2Activity.this.textview);        // SAIR SLIDE PELA DIREITA



		

