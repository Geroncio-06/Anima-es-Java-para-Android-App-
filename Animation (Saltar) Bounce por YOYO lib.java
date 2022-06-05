

-------------------------- ANIMATION BOUNCE POR YOYO LIB -------------------------------------------------------------


1 - No Build Gradle (Module:app) implemente essas libs:


	implementation 'com.daimajia.androidanimations:library:2.4@aar'


2 - Na Activity JAVA do objeto a ser animado:

	Button  btnsub 			// esse button só é o disparador da animação
	TextView textview; 		// objeto a ser animado


	------- em OnCreate:-------------------------------------------------------------------------------------------------


	btnsub = findViewById(R.id.btnsub);
	textview = findViewById(R.id.texto);


	btnsub.setOnClickListener(new View.OnClickListener() {
            
	    @Override
            public void onClick(View param1view) { 						// SALTAR

                YoYo.with(Techniques.Bounce).duration(700).playOn(Main2Activity.this.textview); // animação propriamente 

            }
        });


3 - Outras Animações Bounce:

		YoYo.with(Techniques.BounceIn).duration(700).playOn(Main2Activity.this.textview);     //ENTRAR SALTANDO PARA DENTRO

		YoYo.with(Techniques.BounceInDown).duration(700).playOn(Main2Activity.this.textview); //ENTRAR SALTANDO POR BAIXO

		YoYo.with(Techniques.BounceInUp).duration(700).playOn(Main2Activity.this.textview);   //ENTRAR SALTANDO POR CIMA

		YoYo.with(Techniques.BounceInLeft).duration(700).playOn(Main2Activity.this.textview);   //ENTRAR SALTANDO PELA ESQUERDA

		YoYo.with(Techniques.BounceInRight).duration(700).playOn(Main2Activity.this.textview);   //ENTRAR SALTANDO PELA DIREITA

