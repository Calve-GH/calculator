App on heroku: https://calve-calc.herokuapp.com/

Instructions:
1) Clone or download repository.
2) Open project with your IDE.
3) Run Maven build(war) and deploy it on Tomcat, or use imbedded Local tomcat in your IDE. 

curl

<code>curl -X POST localhost:8080/api/plus -H "Content-Type: application/json;charset=UTF-8" -d '{"firstElement":2, "secondElement":1}'</code>
<br>
<code>curl -X POST localhost:8080/api/minus -H "Content-Type: application/json;charset=UTF-8" -d '{"firstElement":2, "secondElement":1}'</code>
<br>
<code>curl -X POST localhost:8080/api/multiply -H "Content-Type: application/json;charset=UTF-8" -d '{"firstElement":2, "secondElement":1}'</code>
<br>
<code>curl -X POST localhost:8080/api/divide -H "Content-Type: application/json;charset=UTF-8" -d '{"firstElement":2, "secondElement":1}'</code>
<br>
<br>
<table cellspacing="2" border="1" cellpadding="5">
	<thead>
		<tr><th></th><th></th></tr>
	</thead>
<tbody>
	<tr>
	<td><strong>Title</strong></td>
		<td><strong>Plus elements</strong></td>
	</tr>
	<tr>
		<td><strong>URL</strong></td>
		<td><code>/api/plus</code></td>
	</tr>
	<tr>
		<td><strong>Method</strong></td>
		<td><strong>POST</strong></td>
	</tr>
	<tr>
		<td><strong>Sample Request</strong></td>
		<td>
			<code>/api/plus</code>
			<br>
			<code>request body:{"firstElement":2, "secondElement":1}</code>
		</td>
	</tr>
		<tr>
		<td><strong>Success Response</strong></td>
		<td>
			<strong>Code:</strong> 200
			<br>
			<code>{"result":3}</code>
		</td>
	</tr>
	<tr><th></th><th></th></tr>
		<tr>
	<td><strong>Title</strong></td>
		<td><strong>Minus elements</strong></td>
	</tr>
	<tr>
		<td><strong>URL</strong></td>
		<td><code>/api/minus</code></td>
	</tr>
	<tr>
		<td><strong>Method</strong></td>
		<td><strong>POST</strong></td>
	</tr>
	<tr>
		<td><strong>Sample Request</strong></td>
		<td>
			<code>/api/minus</code>
			<br>
			<code>request body:{"firstElement":2, "secondElement":1}</code>
		</td>
	</tr>
		<tr>
		<td><strong>Success Response</strong></td>
		<td>
			<strong>Code:</strong> 200
			<br>
			<code>{"result":1}</code>
		</td>
	</tr>
	<tr><th></th><th></th></tr>
		<tr>
	<td><strong>Title</strong></td>
		<td><strong>Multiply elements</strong></td>
	</tr>
	<tr>
		<td><strong>URL</strong></td>
		<td><code>/api/multiply</code></td>
	</tr>
	<tr>
		<td><strong>Method</strong></td>
		<td><strong>POST</strong></td>
	</tr>
	<tr>
		<td><strong>Sample Request</strong></td>
		<td>
			<code>/api/multiply</code>
			<br>
			<code>request body:{"firstElement":2, "secondElement":1}</code>
		</td>
	</tr>
		<tr>
		<td><strong>Success Response</strong></td>
		<td>
			<strong>Code:</strong> 200
			<br>
			<code>{"result":2}</code>
		</td>
	</tr>
	<tr><th></th><th></th></tr>
		<tr>
	<td><strong>Title</strong></td>
		<td><strong>Divide elements</strong></td>
	</tr>
	<tr>
		<td><strong>URL</strong></td>
		<td><code>/api/divide</code></td>
	</tr>
	<tr>
		<td><strong>Method</strong></td>
		<td><strong>POST</strong></td>
	</tr>
	<tr>
		<td><strong>Sample Request</strong></td>
		<td>
			<code>/api/divide</code>
			<br>
			<code>request body:{"firstElement":2, "secondElement":1}</code>
		</td>
	</tr>
	<tr>
		<td><strong>Success Response</strong></td>
		<td>
			<strong>Code:</strong> 200
			<br>
			<code>{"result":2}</code>
		</td>
	</tr>
	<tr><th></th><th></th></tr>
	<tr>
		<td><strong>Error request body</strong></td>
		<td>
			<code>request body:{"firstElement":"a", "secondElement":1}</code>
		</td>
	</tr>
	<tr>
		<td><strong>Error Response</strong></td>
		<td>
			<strong>Code:</strong> 422 UNPROCESSABLE_ENTITY
			<br>
			<code>{"error":"Invalid value of firstElement"}</code>
		</td>
	</tr>
	<tr><th></th><th></th></tr>
	<tr>
		<td><strong>Other request error</strong></td>
		<td>
			<code>request body:{"firstElement":1.0.0, "secondElement":1}</code>
		</td>
	</tr>
	<tr>
		<td><strong>Error Response</strong></td>
		<td>
			<strong>Code:</strong> 422 UNPROCESSABLE_ENTITY
			<br>
			<code>{"error":"illegal arguments"}</code>
		</td>
	</tr>
	<tr><th></th><th></th></tr>
</tbody>
</table>
